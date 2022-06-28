### The project of testing automation of the vacancy page on the resource hh.ru

---
### Vacancy [QA Engineer](https://ekaterinburg.hh.ru/vacancy/51857862?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20engineer%20java)

<a id="anchor"></a>

:closed_book: __Content__
+ Technologies and tools
+ Implemented checks
+ Build in Jenkins
+ Launch from the terminal
+ Allure Report
+ Telegram Report
+ Video of an example of passing the test




:toolbox:__Technologies and tools__

![Java](https://user-images.githubusercontent.com/99205353/176089306-25bd3a87-d157-44e7-8dce-9b78c46903b3.png)
![Gradle](https://user-images.githubusercontent.com/99205353/176089337-996bd879-5d6e-4dce-a92d-f5baa997009d.png)
![Intelij_IDEA](https://user-images.githubusercontent.com/99205353/176089342-13de613d-5aa5-45b2-b355-8ebf8879c4e2.png)
![Jenkins](https://user-images.githubusercontent.com/99205353/176089357-5edb7793-1c6e-40ee-9fa3-4551e15c9792.png)
![Allure_Report](https://user-images.githubusercontent.com/99205353/176089388-1e6d5743-9e68-4e77-87fc-941affe0e7dd.png)
![Telegram](https://user-images.githubusercontent.com/99205353/176089393-33897979-7898-4d16-9259-5dbb134c7f2c.png)

---
__Implemented checks__

:white_check_mark: _Positive tests_

- [ ] Checking the correspondence of the job title to the expectation: Middle QA Engineer
- [ ] Checking the compliance of the address with the vacancy: Екатеринбург, улица Ткачей, 23
- [ ] Сhecking compliance in key skills Java:  Java


---

:x: _Negative tests_
- [ ] Checking compliance in key skills Jira:  Jira
- [ ] Checking compliance in key skills Selenide:  Selenide

---
:toolbox: __Build in Jenkins__

[Project tests_for_hhru](https://jenkins.autotests.cloud/job/tests_for_hhru/)

![sreenshoot1](https://user-images.githubusercontent.com/99205353/176090762-17d0c0ca-cc35-411d-afe4-7f19ed4e9632.png)


__Parameterized assembly in Jenkins__

We can assemble a job with the proposed parameters by selecting from the drop-down options:

![screenshoot2](https://user-images.githubusercontent.com/99205353/176091253-723b8b48-c6fd-4544-ab17-43cbf786dbb0.png)


---
:computer: __ Launch from the terminal__

Local test run:

```
gradle clean vacancy  
```
Remote test run:
```
clean
vacancy
 -Dbrowser=${BROWSER}
 -DbrowserSize=${BROWSER_SIZE}
 -Dremote=${REMOTE}
```

---
:bar_chart: __Allure Report__

View


![screenshoot](https://user-images.githubusercontent.com/99205353/176091646-7ca4e4ea-e6d2-4ab9-a631-55b4d506fa95.png)


Conducted tests with steps, the ability to view a screenshot, log and video

![screenshoot4](https://user-images.githubusercontent.com/99205353/176092203-97bde9c5-fb34-4e88-a10d-6519e98e3bbc.png)


---
:incoming_envelope: __Отчет в Telegram__

<img width="30%"  title="тлготчет.png" src="images/screenshot/тлготчет.png">

Кроме красочной инфографики достпупна возможность перейти по ссыле для просмотра отчета:
[просмотреть сейчас ](https://jenkins.autotests.cloud/job/Lesson_13_vacancyHh/35/allure/)

---
:clapper: __Видео примера прохождения теста__

Запуск проходит на удаленном веб-драйвере Selenoid
<img title="Selenoid Video" src="images/video/видео.gif">

:arrow_up: [Вверх страницы](#anchor)

---
