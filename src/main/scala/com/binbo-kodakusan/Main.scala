package com.binbo_kodakusan

import scala.util.Random

object Main {
  val R1 = 139833.0 / 2
  val R2 = 12756.0 / 2
  val C1 = 100000
  val C2 = 1000

  case class Ball(x: Double, y: Double, z: Double) {
  }

  var balls: List[Ball] = List()

  def getBall(): Option[Ball] = {
    for (i <- 1 to C1) {
      // ランダムな座標を選択
      val x = Random.nextDouble * R1 * 2
      val y = Random.nextDouble * R1 * 2
      val z = Random.nextDouble * R1 * 2
      // 大きな球の中に入っているか？
      val d = Math.sqrt(Math.pow(x - R1, 2) + Math.pow(y - R1, 2) + Math.pow(z - R1, 2))
      if (R1 >= d + R2) {
        // 他に重なっている小さな球がないか？
        if (balls.forall(ball => Math.sqrt(Math.pow(x - ball.x, 2) + Math.pow(y - ball.y, 2) + Math.pow(z - ball.z, 2)) >= R2 * 2))
          return Some(Ball(x, y, z))
      }
    }
    None
  }

  def main(args: Array[String]): Unit = {
    Random.setSeed(1)

    var f = 1
    var i = 1
    var n = 0
    while (true) {
      // 小さな球体を一つ置く
      val ball = getBall()
      ball match {
        case Some(ball) => {
          // 置けた
          balls = ball :: balls
        }
        case None => {
          // 置けなかった
          if (n < balls.length) {
            n = balls.length
            println(s"R1 = $R1, R2 = $R2, count = $i, n = ${balls.length}")
          } else if (f <= i || (f % 1000) == 0) {
            f = f * 10
            println(s"R1 = $R1, R2 = $R2, count = $i, n = ${balls.length}")
          }
          i = i + 1
          if (C2 < i)
            return
          // 繰り返す
          balls = List()
        }
      }
    }
  }
}
