# Приложение для нахождения файлов определенного формата в указанной директории
____
Приложение выводит количество файлов определенного формата(.pdf, .jpg, .xml,и т.д) и полный путь к каждому файлу.
___
## Оглавление
1. [Описание приложения](#anchor1)
2. [Демо проекта](#anchor2)
3. [Используемые технологии в проекте](#anchor3)
4. [Техническое описание проекта](#anchor4)
___
<a id="anchor1"></a>
### 1.Описание приложения
Данное приложения для добавления изображения в базу данных было написано на open-source среде разработки **Apache Netbeans IDE** с использованием **Java SE 8**. Настройка проекта будет указана в пункте [Техническое описание проекта](#anchor4)

**Цель проекта** - программное нахождение файлов определенного формата в заданной директории
___
<a id="anchor2"></a>
### 2.Демо проекта
**Запускаем программу** 
![avat](https://raw.githubusercontent.com/Denis-spec989/File-finder-application/master/assets/scr1(rew).jpg)
**Вводим директорию и формат файла**
![avat](https://raw.githubusercontent.com/Denis-spec989/File-finder-application/master/assets/scr2.jpg)
**Нажимаем кнопку Find и ждем до появления результата**
![avat](https://raw.githubusercontent.com/Denis-spec989/File-finder-application/master/assets/scr3.jpg)
Было найдено 35 файлов формата **.pdf** и прописаны полные пути к этим файлам
**Поменяем формат файла на .jpg**
![avat](https://raw.githubusercontent.com/Denis-spec989/File-finder-application/master/assets/scr4.jpg)
Было найдено 164 файла формата **.jpg** и прописаны полные пути к этим файлам
___
### 3.Используемые технологии в проекте
<a id="anchor3"></a>
:heavy_check_mark: JavaFX
:heavy_check_mark: Java Stream API
:heavy_check_mark: Java Class File
:heavy_check_mark: Java Collections
___
<a id="anchor4"></a>
### 4.Техническое описание проекта
**Для запуска программы нам обязательно иметь 8 jdk.**
Для поиска нам необходимо ввести директорию и формат файла. Приложение ищет любые существующие форматы , которые поддерживает Java Class File.
После ввода данных нажимаем кнопку **Find** и ждем. Во время ожидания(когда программа ищет файлы) возможно отменить поиск , нажав кнопку **Cancel**
___
Автор: Игнатов Денис
e-mail: proanglerdenis@gmail.com





