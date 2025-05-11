package com.project.coursecatalog

val sampleCourses = listOf(
    Course(
        title = "Fundamentals of AI",
        code = "SECT-3151",
        creditHours = 5,
        description = "This course provides a comprehensive introduction to the fundamental concepts and techniques of Artificial Intelligence. Topics include problem solving, search algorithms, knowledge representation, reasoning, and basic machine learning. Students will explore real-world applications of AI and gain hands-on experience with AI tools and frameworks through practical assignments and projects.",
        prerequisites = "SECT-3122 (Computer Organizations and Architecture)"
    ),
    Course(
        title = "Fundamentals of Cybersecurity",
        code = "SECT-3141",
        creditHours = 5,
        description = "An in-depth study of cybersecurity principles, including threat models, cryptography, network security, and secure software development. The course covers both theoretical foundations and practical approaches to securing computer systems and networks. Students will analyze case studies and participate in labs to understand vulnerabilities and defense mechanisms.",
        prerequisites = "SECT-2111 (Fundamentals of Software Engineering)"
    ),
    Course(
        title = "Computer Graphics",
        code = "SECT-3132",
        creditHours = 5,
        description = "This course introduces the principles and techniques of computer graphics. Topics include graphics hardware, 2D and 3D rendering, geometric transformations, lighting, shading, and animation. Students will develop graphics applications and gain experience with graphics programming libraries, focusing on both the mathematical and practical aspects of the field.",
        prerequisites = "SECT-3122 (Computer Organizations and Architecture)"
    ),
    Course(
        title = "Mobile Application Development",
        code = "SECT-3113",
        creditHours = 7,
        description = "A hands-on course focused on the design and development of mobile applications. Students will learn about mobile platforms, user interface design, data management, and device integration. The course emphasizes building robust, user-friendly apps and covers best practices for performance, security, and deployment in the mobile ecosystem.",
        prerequisites = "SECT-3112 (Web Design and Programming)"
    ),
    Course(
        title = "Operating Systems and System Programming",
        code = "SECT-3082",
        creditHours = 7,
        description = "This course explores the design and implementation of modern operating systems. Topics include process management, memory management, file systems, concurrency, and system-level programming. Students will gain practical experience by writing system programs and analyzing the inner workings of operating systems through projects and labs.",
        prerequisites = "SECT-2101 (Object Oriented Programming)"
    )
) 