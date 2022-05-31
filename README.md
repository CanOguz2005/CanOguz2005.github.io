## Welcome to the fitness app

This app is meant to help you along your fitness journey by providing you with supplement and calorie tracking advice while allowing you to calculate your maximum possible lifts without risk of injury, and by giving you your ideal body weight which should help you keep your goals in track.
### abstract
Basically this project takes in your physical characteristics and after putting it through several equations returns accurate personalized data and reccomendations.

### input

Input is the values about yourself that you must feed this app to recieve the most accurate results, these include
-weight
-age
-height
-5 rep maximum
-bodyfat percentage(optional but helps in calculating calorie intake)

```markdown
Values recieved
-Suggested protein intake
-Suggested creatin intake
-Your max bench press/squat/deadlift
-maintenince calories
-Calories to gain weight
-Calories to lose weight
-ideal body weight

```
Equations used:
-weight*1.1 for protein
-(weight*30/1000)+1 for creatine
-((Max lift at 5 reps) * 1.1307 + 0.6998) for Max lift
-21.6*(1-(bodyfat/100))*weight + 370.0 for calories using bodyfat percentage
-(13.397*weight) + (4.799*ac) - (5.677*ak) + 88.362 for calories without bodyfat percentage
-bulk = maintenince calories+300;
-cut = maintenince-300;
-(52+(height-152)*0.74803149606) for optimum weight

## Future
The future of this project would be to create a fully functioning app with additional functions. For example this app could also plan your workout or your diet instead of simply giving recommendations.
## motivation
The motivation for this project stems from my own life. At the gym I realized that I was actually very ignorant and was not training to my maximum potential. I saw my friend who was 20kg less then me taking the same amount of supplements and calories and thought that one of us must be training wrong because in the end our bodies were very different. This is when I realized that training had to be personalized instead of simply using general reccomendations if one wanted to train to maximum effect. Therefore I decided to create this fitness app and returned personalized data to all who entered the neccesary data.
