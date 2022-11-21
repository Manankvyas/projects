from random import *

user_wins = 0
computer_wins = 0
choices = ["stone","paper","scissors"]
welcome = print("welcome to your nostaligic game")
for i in range(4):
    if i<=4:
        user_input = input("type stone/paper/scissors or e to exit the game ").lower()
        if user_input == 'e':
            print("please visit again")
            quit()
        if user_input not in choices:
            print("please enter a valid input")
            continue
        else:
            random_number = randint(0, 2)
            computer_pick = choices[random_number]
            print("computer picked " + computer_pick)
            if user_input == "stone" and computer_pick == "scissors":
                print("you win!")
                user_wins = user_wins+1
            elif user_input == "stone" and computer_pick == "stone":
                print("it's a tie!")
            elif user_input == "paper" and computer_pick == "paper":
                print("it's a tie!")
            elif user_input == "scissors" and computer_pick == "scissors":
                print("it's a tie!")
            elif user_input == "scissors" and computer_pick == "paper":
                print("you win!")
                user_wins = user_wins + 1
            elif user_input == "paper" and computer_pick == "stone":
                print("you win!")
                user_wins = user_wins + 1
            else:
                print("you lost")
                computer_wins = computer_wins+1
print("you won " + str(user_wins) + " times")












