# Machine Learning

## Agenda

Overview
- Definition
- Why now?
- Types of Data

Statistics

Supervised Algorithm

## Definition

"Machine learning is the field of study that gives computres that ability to learn without being explicitly programmed."

## Why now?

- Increased computational power
    - According to Shane Legg, a cofounder of Google DeepMind: "Taining run that takes one day on a single TPU device would have taken a quartar of a milion years on an 80486 from 1990"
- A lot of data

## Types of Data

- Qualitative Data is data which represends characteristics like a person's gender, language etc.
    - Nominal Data
    - Ordinary Data
- Quantitative Data
    - Discrete Data
    - Continious Data

## Statistics

- Mean - the middle element of an array
    - ``` x = [10, 20, 30, 40, 50] ```
- Mode - represents the most common value in a data set.
- Variance and Standart Deviation are essentialy a measure of the spread of the data in the data set.
- Variance is the average of the squared differences from the mean.
- Standard Deviation is the square root of the variance.
- Percentile - is a measure used in statistics indicating the value below which a given percentage of obersvations in a group of observations fall.
- Correlation - measures how two variables move with respect to each other. A perfect positive correlation means that the correlation coefficient is 1. A perfect negative correlation means that the correlation coefficient is -1. A correlation coefficient of 0 means that the two variables are independent of each other.

Types of learning:
- ``Supervised``
    - Classification
        - Idenity Fraud Detection
        - Image Classification
        - Customer Retention
        - Diagnostics
    - Regression
        - Advertising popularity
        - Weather Forecasting
        - Population Growth
- ``Unsupervised``
- ``Reinforcement``
    - Real-time decisions
    - Robot Navigation
    - Learning Tasks
    - Skill Acquistion

## Supervised Learning

### Linear Regression

- Finds the linear dependecy between an input vector X (**feature**) and an output vector Y (**label**)

- Multiple **feature** vectors can be combined into a matrix

- **Labels** are most likely numerical

- Linear regression behind the scenes
    - Optimization objective
    - Gradient Descent Algorithm