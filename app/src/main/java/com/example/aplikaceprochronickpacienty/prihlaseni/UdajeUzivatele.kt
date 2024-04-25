package com.example.aplikaceprochronickpacienty.prihlaseni

/** Jednotlivé údaje o uživateli, které se ukládají do databáze **/
class UdajeUzivatele(var jmenoPrijmeni: String? = null,
                     var email: String? = null,
                     var uzivatelskeJmeno: String? = null,
                     var googleUcet: Boolean,
                     var oznameni: Boolean,
                     var darkMode: Boolean,
                     var datumNarozeni: String? = null,
                     var vyska: String? = null,
                     var krokyCil: Int,
                     var vahaCil: Double,
                     var profilovyObrazek: String,
                     var nemoc: String) {


}
