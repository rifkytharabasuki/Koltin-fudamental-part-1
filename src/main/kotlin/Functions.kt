fun main(){
    val user = setUser("Rifky Thara Basuki", 15,"Main")
    println(user)
}
fun setUser(name: String, age: Int, hobby: String) = "My name is $name, I like $hobby, and I'm $age years old"