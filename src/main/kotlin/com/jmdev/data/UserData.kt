package com.jmdev.data

import com.jmdev.model.PortfolioData
import com.jmdev.model.Project
import com.jmdev.model.SocialLink
import com.jmdev.model.TechStack

fun getPortfolioData(): PortfolioData {
    return PortfolioData(
        devName = "JM Dev",
        fullName = "Juan Manuel Velázquez",
        headerDescription = "Técnico Informático | Desarrollador Android | Desarrollador Web Frontend",
        profilePhoto = "https://avatars.githubusercontent.com/u/115042535?s=400&u=62a596cea79ad50f38ed1e841b021acae7b7b79a&v=4",
        location = "Ciudad de Limpio, Paraguay",
        aboutMeDescription = "Soy un desarrollador apasionado por crear aplicaciones y sitios web modernos, intuitivos y funcionales. Mi objetivo es combinar diseño atractivo con tecnología para brindar experiencias excepcionales a los usuarios.",
        myStack = listOf(
            TechStack("Android Jetpack Compose", "https://jmdev-portfolio-data-source.onrender.com/static/ic-compose.webp"),
            TechStack("Kotlin", "https://jmdev-portfolio-data-source.onrender.com/static/ic-kotlin.webp"),
            TechStack("Ktor", "https://jmdev-portfolio-data-source.onrender.com/static/ic-ktor.webp"),
            TechStack("React", "https://jmdev-portfolio-data-source.onrender.com/static/ic-react.webp"),
            TechStack("AstroJS", "https://jmdev-portfolio-data-source.onrender.com/static/ic-astro.webp"),
            TechStack("TailwindCSS", "https://jmdev-portfolio-data-source.onrender.com/static/ic-tailwindcss.webp"),
            TechStack("JS", "https://jmdev-portfolio-data-source.onrender.com/static/ic-js.webp"),
            TechStack("Python", "https://jmdev-portfolio-data-source.onrender.com/static/ic-python.webp")
        ),
        myProjects = listOf(
            Project(
                name = "CodeCollection",
                description = "Repositorio con una colección de scripts y soluciones en varios lenguajes, ideales para aprender y mejorar tus habilidades de programación.",
                icon = "https://jmdev-portfolio-data-source.onrender.com/static/ic-code.webp",
                link = "https://github.com/juanmadev5/CodeCollection"
            ),
            Project(
                name = "Imagify",
                description = "Aplicación Android avanzada para búsqueda y descarga de imágenes desde unsplash.com, desarrollado con Kotlin y Jetpack Compose.",
                icon = "https://jmdev-portfolio-data-source.onrender.com/static/ic-android.webp",
                link = "https://github.com/juanmadev5/Imagify"
            ),
            Project(
                name = "Este portafolio",
                description = "Este portafolio es una muestra de mis habilidades como desarrollador, incluyendo mis proyectos y experiencias. Desarrollado con React, TailwindCSS y TypeScript. Diseño: Material You",
                icon = "https://jmdev-portfolio-data-source.onrender.com/static/ic-react.webp",
                link = "https://github.com/juanmadev5/me"
            ),
            Project(
                name = "LearnWithMe",
                description = "Blog desarrollado con AstroJS, demostrando mis habilidades en el desarrollo de aplicaciones modernas y optimizadas con una arquitectura sin servidor.",
                icon = "https://jmdev-portfolio-data-source.onrender.com/static/ic-astro.webp",
                link = "https://github.com/juanmadev5/learn-with-me"
            )
        ),
        socialLinks = listOf(
            SocialLink(name = "GitHub", icon = "https://jmdev-portfolio-data-source.onrender.com/static/ic-github.webp", link = "https://github.com/juanmadev5"),
            SocialLink(
                name = "LinkedIn",
                icon = "https://jmdev-portfolio-data-source.onrender.com/static/ic-linkedin.webp",
                link = "https://www.linkedin.com/in/juan-manuel-vel%C3%A1zquez-ba8a342ba?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app"
            ),
            SocialLink(name = "Contactame", icon = "https://jmdev-portfolio-data-source.onrender.com/static/ic-contactme.webp", link = "#form")
        )
    )
}