package vn.edu.iuh.fit.vudangkhoi_lab5.backend.enums

import lombok.Getter

@Getter
enum class SkillLevel(private val level: Int) {
    BEGINNER(1),
    INTERMEDIATE(2),
    ADVANCED(3),
    PROFESSIONAL(4),
    MASTER(5);

    fun getLevel(): Int {
        return level
    }
}
