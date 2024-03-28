FROM adoptopenjdk/openjdk21:alpin-jre

WORKDIR /app

COPY target/telegram-bot.jar/app

CMD ["java" , "-jar" , "telegram-bot.jar"]