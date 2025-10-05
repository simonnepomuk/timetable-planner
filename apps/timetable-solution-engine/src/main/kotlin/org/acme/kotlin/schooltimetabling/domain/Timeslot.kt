package org.acme.kotlin.schooltimetabling.domain

import ai.timefold.solver.core.api.domain.lookup.PlanningId
import com.fasterxml.jackson.annotation.JsonIdentityInfo
import com.fasterxml.jackson.annotation.ObjectIdGenerators
import java.time.DayOfWeek
import java.time.LocalTime

data class Timeslot(
    val dayOfWeek: DayOfWeek,
    val startTime: LocalTime,
    val endTime: LocalTime = startTime.plusMinutes(50)) {

    override fun toString(): String = "$dayOfWeek $startTime"

}
