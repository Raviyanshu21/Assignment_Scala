def tailRec(num: Int, res: Int): Int = {
  if(num == 1) res
  else tailRec(num - 1 , res + num)
}
println(tailRec(99999, 1))

def rec(num: Int): Int = {
  if(num == 1) 1
  else rec(num-1) + num
}
println(rec(99999))