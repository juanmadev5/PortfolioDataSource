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
            TechStack("Android Jetpack Compose", "composeIcon"),
            TechStack("Kotlin", "/static/ic-kotlin.webp"),
            TechStack("React", "/static/ic-react.webp"),
            TechStack("AstroJS", "/static/ic-astro.webp"),
            TechStack("TailwindCSS", "/static/ic-tailwindcss.webp"),
            TechStack("JS", "/static/ic-js.webp"),
            TechStack("Python", "/static/ic-python.webp")
        ),
        myProjects = listOf(
            Project(
                name = "CodeCollection",
                description = "Repositorio con una colección de scripts y soluciones en varios lenguajes, ideales para aprender y mejorar tus habilidades de programación.",
                icon = "/static/ic-code.webp",
                link = "https://github.com/juanmadev5/CodeCollection"
            ),
            Project(
                name = "Imagify",
                description = "Aplicación Android avanzada para búsqueda y descarga de imágenes desde unsplash.com, desarrollado con Kotlin y Jetpack Compose.",
                icon = "/static/ic-android.webp",
                link = "https://github.com/juanmadev5/Imagify"
            ),
            Project(
                name = "Este portafolio",
                description = "Este portafolio es una muestra de mis habilidades como desarrollador, incluyendo mis proyectos y experiencias. Desarrollado con React, TailwindCSS y TypeScript. Diseño: Material You",
                icon = "/static/ic-react.webp",
                link = "https://github.com/juanmadev5/me"
            ),
            Project(
                name = "LearnWithMe",
                description = "Blog desarrollado con AstroJS, demostrando mis habilidades en el desarrollo de aplicaciones modernas y optimizadas con una arquitectura sin servidor.",
                icon = "/static/ic-astro.webp",
                link = "https://github.com/juanmadev5/learn-with-me"
            )
        ),
        socialLinks = listOf(
            SocialLink(name = "GitHub", icon = "githubIcon", link = "https://github.com/juanmadev5"),
            SocialLink(
                name = "LinkedIn",
                icon = "/static/ic-linkedin.webp",
                link = "https://www.linkedin.com/in/juan-manuel-vel%C3%A1zquez-ba8a342ba?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app"
            ),
            SocialLink(name = "Contactame", icon = "contactMe", link = "#form")
        )
    )
}