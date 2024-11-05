# DataForSocialGood
# Unit 3 - Data for Social Good Project

## Introduction

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program:
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors.
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about.
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset).
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## User Story

Include your User Story you analyzed for your project here. Your User Story should have the following format:

> As a student I want to find out what school has, <br>
> the most acceptances and what college has the most amount <br>
> of students enrolled, so that I can inform myself and others <br>
> what university in America is the most popular <br>
> vs which school has the most amount of students attending. <br>

## Dataset

  Dataset: https://www.kaggle.com/datasets/samsonqian/college-admissions

- **Applicant Total** (int) - number of applicants
- **College Name** (String) - name of colleges
- **Enrolled Total** (int) - number of enrolled students



## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README.

![Screenshot 2024-10-31 8 49 24 AM](https://github.com/user-attachments/assets/c0278ae4-f87e-49f2-82ee-87c0114439b1)



![UML Diagram for my project](nameOfImageFileHere.png)

## Description

Our project focuses on universities in the United States and the data based on their admission process. We were able to pull the information using a 1D array labeled schoolTitles[], numberOfApplicants[], numberOfEnr	olled[]. The details we chose to focus on were the College names, the total number of applicants, the total number of people accepted/admitted to the school, the min or max number of applicants throughout the schools, and the amount of people who actually enrolled in the school. We used multiple txt files named schools, applicants, and enrolled to pull the information from the data set we found. In the end we ended up cutting the information down and allowing the user to find out the college with the most number of people enrolled and the college with the most amount of applicants.
