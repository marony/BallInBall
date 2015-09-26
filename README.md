# 球体の中にそれより小さな球体はいくつ入るかシミュレーション

　半径R1の球体の中に、半径R2の球体(R2 < R1)はいくつ入るのかという問題
　長男が質問してきてさっぱりわからなくて答えられないのでシミュレーションします。

　大きな球体か小さな球体に接した場所に小さな球体を重ならないように置いていって、置けなくなった時の個数を数えようかと思ったのですが、単純にモンテカルロ法で行おうと思います。

　実行結果は下に掲載してありますが、物の本によると木星の中に地球は1320個入るらしいのですが、このプログラムでは439個となってしまいました。
　もっと効率的に小さな球体を配置するように改善しないとだめなようです。次は球体を置く場所を完全にランダムではなく、大きな外周か小さな球体に接していることを条件に加えようと思います。

![木星の大きさ](https://raw.github.com/wiki/marony/BallInBall/images/image1.jpg)


## 実行結果
    [info] Running com.binbo_kodakusan.Main 
    R1 = 69916.5, R2 = 6378.0, count = 1, n = 422
    R1 = 69916.5, R2 = 6378.0, count = 2, n = 409
    R1 = 69916.5, R2 = 6378.0, count = 10, n = 416
    R1 = 69916.5, R2 = 6378.0, count = 18, n = 429
    R1 = 69916.5, R2 = 6378.0, count = 42, n = 430
    R1 = 69916.5, R2 = 6378.0, count = 81, n = 432
    R1 = 69916.5, R2 = 6378.0, count = 100, n = 424
    R1 = 69916.5, R2 = 6378.0, count = 101, n = 408
    R1 = 69916.5, R2 = 6378.0, count = 102, n = 403
    R1 = 69916.5, R2 = 6378.0, count = 103, n = 420
    R1 = 69916.5, R2 = 6378.0, count = 104, n = 425
    R1 = 69916.5, R2 = 6378.0, count = 105, n = 403
    R1 = 69916.5, R2 = 6378.0, count = 106, n = 414
    R1 = 69916.5, R2 = 6378.0, count = 107, n = 416
    R1 = 69916.5, R2 = 6378.0, count = 137, n = 434
    R1 = 69916.5, R2 = 6378.0, count = 486, n = 435
    R1 = 69916.5, R2 = 6378.0, count = 659, n = 439


## 作業メモ
    $ activator new Pi
    4) minimal-scala
    
    $ cd Pi
    $ sbt run
    
    $ mv src/main/scala/com/example src/main/scala/com/binbo-kodakusan
    $ mv src/main/scala/com/binbo-kodakusan/Hello.scala src/main/scala/com/binbo-kodakusan/Main.scala

