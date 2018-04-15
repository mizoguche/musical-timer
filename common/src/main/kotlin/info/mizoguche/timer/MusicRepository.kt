package info.mizoguche.timer

interface MusicRepository {
    fun load(): Music
    fun save(music: Music)
}