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
- [ ] Сhecking compliance in key skills Java


---

:x: _Negative tests_
- [ ] Checking compliance in key skills Jira
- [ ] Checking compliance in key skills Selenide

---
:toolbox: __Build in Jenkins__

[Project tests_for_hhru](https://jenkins.autotests.cloud/job/tests_for_hhru/)

![sreenshoot1](https://user-images.githubusercontent.com/99205353/176090762-17d0c0ca-cc35-411d-afe4-7f19ed4e9632.png)


__Parameterized assembly in Jenkins__

We can assemble a job with the proposed parameters by selecting from the drop-down options:

![screenshoot2](https://user-images.githubusercontent.com/99205353/176091253-723b8b48-c6fd-4544-ab17-43cbf786dbb0.png)


---
:computer: __Launch from the terminal__

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


![allurereport](https://user-images.githubusercontent.com/99205353/176164827-370ef34d-f385-42a7-b9b6-a17e2b7ff2d5.png)



Conducted tests with steps, the ability to view a screenshot, log and video

![allure2](https://user-images.githubusercontent.com/99205353/176166356-6bcd72cd-8d08-4385-b9de-c2e434632b57.png)



---
:incoming_envelope: __Telegram Report__

![screenshoot5](https://user-images.githubusercontent.com/99205353/176134883-52912982-5fa4-4df9-b75e-68d9d255acbe.png)


In addition to colorful infographics, you can click on the link to view the report:
https://jenkins.autotests.cloud/job/tests_for_hhru/16/allure/#


---
:clapper: __Video of an example of passing the test__

The launch takes place on a remote Selenoid web driver


https://user-images.githubusercontent.com/99205353/176093908-c10156d7-63d9-4544-90f2-cd1d3d918a6e.mp4



:arrow_up: [Up the page](#anchor)

---
