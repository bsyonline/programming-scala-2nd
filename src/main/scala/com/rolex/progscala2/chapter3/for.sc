val dogBreeds = List("Doberman", "Yorkshire Terrier",
  "Dachshund", "Scottish Terrier",
  "Great Dane", "Portuguese Water Dog")

// 基本 for 循环
for (breed <- dogBreeds)
  println(breed)

// 生成器表达式
for (i <- 1 to 10) println(i)

// 保户式
for (breed <- dogBreeds if breed.contains("Terrier")) println(breed)
// 多个保护式
for (breed <- dogBreeds if breed.contains("Terrier") if !breed.startsWith("Yorkshire")) println(breed)
for (breed <- dogBreeds if breed.contains("Terrier") && !breed.startsWith("Yorkshire")) println(breed)