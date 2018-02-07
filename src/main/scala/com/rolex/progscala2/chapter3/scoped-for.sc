val dogBreeds = List("Doberman", "Yorkshire Terrier",
  "Dachshund", "Scottish Terrier",
  "Great Dane", "Portuguese Water Dog")

// 使用在for表达式中定义的变量
for{
  breed <- dogBreeds
  upperBreed = breed.toUpperCase
} printf(upperBreed)
