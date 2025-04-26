package ıkıncıodev.idea

    fun main() {
        val o = Odev2()
        val derece = 25.0
        println("25 derece Fahrenheit cinsinden: ${o.dereceToFahrenheit(derece)}")


        val kisaKenar = 5
        val uzunKenar = 10
        println("Dikdörtgenin çevresi: ${o.dikdortgenCevresi(kisaKenar, uzunKenar)}")

        val sayi = 5
        println("5 sayısının faktöriyeli: ${o.faktoriyelHesapla(sayi)}")

        val kelime = "Ankara"
        println("'Ankara' kelimesinde 'a' harfi sayısı: ${o.aHarfiSayisi(kelime)}")


        val kenarSayisi = 5
        println("5 kenarlı bir çokgenin iç açıları toplamı: ${o.icAciToplami(kenarSayisi)} derece")

        val gunSayisi = 22
        println("22 gün çalışan birinin maaşı: ${o.maasHesapla(gunSayisi)} ₺")

        val kullanilanGb = 60
        println("60 GB internet kullanan birinin ödeyeceği ücret: ${o.kotaUcretiHesapla(kullanilanGb)} ₺")


}