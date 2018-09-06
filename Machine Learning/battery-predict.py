from sklearn import linear_model, datasets
from sklearn.metrics import mean_squared_error, r2_score
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

data = pd.read_csv("./battery-data.csv", header=None)
X = np.array(data[data.columns[0]]).reshape(data.shape[0], 1)
Y = np.array(data[data.columns[1]]).reshape(data.shape[0], 1)

y_train = Y[:-10]
y_test = Y

x_train = X[:-10]
x_test = X

linear_regression = linear_model.LinearRegression()
linear_regression.fit(x_train, y_train)

y_pred = linear_regression.predict(x_test)

print("Coefficients: ", linear_regression.coef_)
print("Mean Squared Error %f.02: " % mean_squared_error(y_test, y_pred))
print("R2 score: %f" % r2_score(y_test, y_pred))

result = linear_regression.predict(100)
print("Result: ", result)

plt.scatter(x_test, y_test, color="blue")
plt.plot(x_test, y_pred, color="green")
plt.show()