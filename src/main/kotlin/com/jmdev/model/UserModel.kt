package com.jmdev.model

import kotlinx.serialization.Serializable

@Serializable
data class PortfolioData(
    val devName: String,
    val fullName: String,
    val headerDescription: String,
    val profilePhoto: String,
    val location: String,
    val aboutMeDescription: String,
    val myStack: List<TechStack>,
    val myProjects: List<Project>,
    val socialLinks: List<SocialLink>
)

@Serializable
data class TechStack(
    val name: String,
    val icon: String
)

@Serializable
data class Project(
    val name: String,
    val description: String,
    val icon: String,
    val link: String
)

@Serializable
data class SocialLink(
    val name: String,
    val icon: String,
    val link: String
)
