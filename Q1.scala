def prime(n: Int): Boolean =
    if (n <= 1)
        false
    else if (n == 2)
        true
    else
        !(2 until n).exists(x => n % x == 0)
