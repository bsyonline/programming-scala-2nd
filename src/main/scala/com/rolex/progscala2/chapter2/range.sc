val r1 = 1 to 10
for (r <- r1) print(r + " ")

val r2 = 1 until 10
for (r <- r2) print(r + " ")

val r3 = 1 to 10 by 3
for (r <- r3) print(r + " ")

val r4 = 10 to 1 by -3
for (r <- r4) print(r + " ")

val r5 = 1L to 10L by 3
for (r <- r5) print(r + " ")

val r6 = 1.1f to 10.3f by 3.1f
for (r <- r6) print(r + " ")

val r7 = 1.1f to 10.3f by 0.5f
for (r <- r7) print(r + " ")

var r8 = 1.1 to 10.3 by 3.1
for (r <- r8) print(r + " ")

val r9 = 'a' to 'z' by 3
for (r <- r9) print(r + " ")

val r10 = BigInt(1) to BigInt(10) by 3
for (r <- r10) print(r + " ")

val r11 = BigDecimal(1) to BigDecimal(10) by 3.1
for (r <- r11) print(r + " ")




