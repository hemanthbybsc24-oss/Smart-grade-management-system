from sklearn.metrics import confusion_matrix, accuracy_score
import numpy as np
y_true = np.array([0, 1, 0, 1])
y_pred = np.array([0, 1, 1, 1])
print("Confusion Matrix:", confusion_matrix(y_true, y_pred))
print("Accuracy Score:", accuracy_score(y_true, y_pred))