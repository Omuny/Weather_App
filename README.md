# Погодник — приложение для просмотра погоды

<img src="https://github.com/user-attachments/assets/4578d446-659f-432b-a4b6-2750c72c1e1c" alt="Интерфейс приложения">

JavaFX-приложение для получения текущей погоды через API OpenWeatherMap. Отображает:
- 🌡️ Текущую температуру
- 🌬️ Ощущаемую температуру
- ⬆️ Максимальную/⬇️ минимальную температуру
- 🎚️ Атмосферное давление

## Особенности
- 🖥️ Графический интерфейс, GUI (JavaFX + FXML)
- 🔍 Поиск по 200,000+ городам мира
- 📡 Реальные данные с OpenWeatherMap API
- 🎨 Простой и интуитивно понятный, cтильный дизайн

## Требования
- JDK 17+ (с поддержкой JavaFX)
- [JSON-Java библиотека](https://github.com/stleary/JSON-java) (уже подключена в коде)
- API-ключ от OpenWeatherMap (в коде используется тестовый ключ)
- Интернет-соединение

## Установка
1. Клонируйте репозиторий:
```bash
git clone https://github.com/ваш-логин/погодник.git
```
2. Установите зависимости через Maven/Gradle (или добавьте вручную):
- JavaFX SDK
- org.json (версия 20231013)
- Убедитесь, что в module-info.java указаны все модули:
```java
requires javafx.controls;
requires javafx.fxml;
requires org.json;
```

## Запуск
```bash
javac --module-path "путь/к/javafx-sdk/lib" \
      --add-modules javafx.controls,javafx.fxml \
      -d out src/*.java module-info.java

java --module-path "путь/к/javafx-sdk/lib" \
     --add-modules javafx.controls,javafx.fxml \
     -cp out com.weather.Main
```
Замените `путь/к/javafx-sdk` на актуальный путь к вашему JavaFX SDK

## Как использовать
1. Введите название города в текстовое поле
2. Нажмите кнопку "УЗНАТЬ ПОГОДУ"
3. Получите актуальные данные:
<img src="https://github.com/user-attachments/assets/a274ccc2-499a-4e4a-89dc-83842aade218" alt="Пример результатов">

## Структура проекта
```
src/main/
├── java/
│   ├── com/weather/
│   │   ├── Controller.java   # Логика приложения и работа с API
│   │   └── Main.java         # Запуск приложения
│   └── module-info.java      # Конфигурация модулей
└── resources/
    └── Weather-view.fxml     # Верстка интерфейса (GUI)
```

## Важные замечания
1. 🔑 API-ключ в коде (ffff37ddc...) — демонстрационный.
   Зарегистрируйтесь на OpenWeatherMap и укажите свой ключ:
```java
// В Controller.java замените:
String url = "...appid=ВАШ_КЛЮЧ&units..."
```
2. Приложение не обрабатывает некоторые ошибки (например, отсутствие интернета)

<img src="https://github.com/user-attachments/assets/e23026bc-4e49-4e65-9537-efe1854985c9" alt="Пример работы приложения 1">
<img src="https://github.com/user-attachments/assets/e6773e4d-de40-44d2-b2b8-108416ced4f4" alt="Пример работы приложения 2">