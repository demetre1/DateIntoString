 fun main(){
val Date = date(20,9,2022);
     Date.toStrings();


 }

open class date(var DD:Int  , var MM:Int , var YY:Int){



}

fun date.toStrings(){
    println(" Day : ${this.DD} - Month: ${this.MM} - Year: ${this.YY}")
}