val list = List(1, 2, 3, 4, 5)

val res1 = list reduce (_ + _)

val res2 = (list fold 1) (_ + _)

val res3 = (list fold (2)) (_ + _)

val res4 = list.fold(3)(_ * _)

val fold1 = (list fold 4) _

val res5 = fold1(_ + _)

// can not
//val res6 = List.empty[Int] reduce (_+_)

val res7 = List.empty[Int] reduceOption (_ + _)

val res8 = list reduceOption (_ + _)

val res9 = (List.empty fold 10) (_ + _)
