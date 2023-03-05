import java.util.*

data class Country(
    val name: String,
    val continient: String,
    val population: Int
)
class CountryApp{
    fun filterCoutries(coutries:List<Country>):List<Country>{
        val res = ArrayList<Country>()
        for (c in coutries){
            if (c.continient == "EU"){
                res.add(c)
            }
        }
        return res
    }
    fun filterCoutries(countries:List<Country>,continient: String):List<Country>{
        val res = ArrayList<Country>()
        for (c in countries){
            if (c.continient==continient){
                res.add(c)
            }
        }
        return res
    }
    fun filer(countries: List<Country>,continient: String,population: Int):List<Country>{
        val res = ArrayList<Country>()
        for (c in countries){
            if (c.continient == continient&&c.population>population){
                res.add(c)
            }
        }
        return res
    }
}
class CountryTest{
    fun isBigEurropeanCountry(country: Country):Boolean{
        return country.continient == "EU"&&country.population>1000
    }
}
fun filterCountries(countries: List<Country>, test:(Country)->Boolean):List<Country>{
    val res = ArrayList<Country>()
    for (c in res){
        if (test(c)){
            res.add(c)
        }
    }
    return res
}


