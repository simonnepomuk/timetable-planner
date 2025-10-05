package org.acme.kotlin.schooltimetabling.domain

import ai.timefold.solver.core.api.domain.lookup.PlanningId
import com.fasterxml.jackson.annotation.JsonIdentityInfo
import com.fasterxml.jackson.annotation.ObjectIdGenerators

data class Room(
    val name: String) {

    override fun toString(): String = name

}
