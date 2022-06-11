fun main(){
    val amount = 100000
    val commissionPercent = 0.75
    val minCommission = 350

    val commission = amount * commissionPercent/100
    val result =  if (commission < minCommission) minCommission else commission
    println("Комииссия за перевод составит: $result коп")
}