package com.rolex.progscala2.chapter3

/**
  * Created by rolex on 5/25/17.
  */
object Breed extends Enumeration {
  type Breed = Value
  val doberman = Value("Doberman Pinscher")
  val yorkie = Value("Yorkshire Terrier")
  val scottie = Value("Scottish Terrier")
  val dane = Value("Great Dane")
  val portie = Value("Portuguese Water Dog")

  def main(args: Array[String]): Unit = {
    // print a list of breeds and their IDs
    println("ID\tBreed")
    for (breed <- Breed.values) println(s"${breed.id}\t$breed")

    // print a list of Terrier breeds
    println("\nJust Terriers:")
    Breed.values filter (_.toString.endsWith("Terrier")) foreach println

    def isTerrier(b: Breed) = b.toString.endsWith("Terrier")

    println("\nTerriers Again??")
    Breed.values filter isTerrier foreach println
  }
}
