package ıkıncıodev.idea

class Odev2 {
    fun dereceToFahrenheit(derece: Double): Double {
        return derece * 1.8 + 32
    }
    fun dikdortgenCevresi(kisaKenar: Int, uzunKenar: Int): Int {
        return 2 * (kisaKenar + uzunKenar)
    }
    fun faktoriyelHesapla(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }
    fun aHarfiSayisi(kelime: String): Int {
        return kelime.count { it == 'a' || it == 'A' }
    }
    fun icAciToplami(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }
    fun maasHesapla(gunSayisi: Int): Int {
        val calismaSaati = gunSayisi * 8
        return if (calismaSaati <= 160) {
            calismaSaati * 10
        } else {
            (160 * 10) + ((calismaSaati - 160) * 20)
        }
    }
    fun kotaUcretiHesapla(kullanilanGb: Int): Int {
        return if (kullanilanGb <= 50) {
            100
        } else {
            100 + (kullanilanGb - 50) * 4
        }
    }

}