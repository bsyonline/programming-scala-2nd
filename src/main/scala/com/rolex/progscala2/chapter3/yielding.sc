val dogBreeds = List("Doberman", "Yorkshire Terrier",
  "Dachshund", "Scottish Terrier",
  "Great Dane", "Portuguese Water Dog")

val foo = for {
  breed <- dogBreeds
  if breed.contains("Terrier") && !breed.startsWith("Yorkshire")
} yield breed

foo