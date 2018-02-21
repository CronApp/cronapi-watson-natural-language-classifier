package cronapi.watson.natural_language_classifier;

import com.ibm.watson.developer_cloud.natural_language_classifier.v1.NaturalLanguageClassifier;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classification;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classifier;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classifiers;
import cronapi.CronapiMetaData;

import java.io.File;
import java.util.Map;

@CronapiMetaData
public final class NaturalLanguageClassifierOperations {

  @CronapiMetaData
  public static Classification classify(String username, String password, String endPoint, Map<String, String> headers,
                                        String classifierId, String text) {
    NaturalLanguageClassifier service = new NaturalLanguageClassifier();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.classify(classifierId, text).execute();
  }

  @CronapiMetaData
  public static Classifier createClassifier(String username, String password, String endPoint, Map<String, String> headers,
                                            String name, String language, File trainingData) {
    NaturalLanguageClassifier service = new NaturalLanguageClassifier();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createClassifier(name, language, trainingData).execute();
  }

  @CronapiMetaData
  public static void deleteClassifier(String username, String password, String endPoint, Map<String, String> headers,
                                      String classifierId) {
    NaturalLanguageClassifier service = new NaturalLanguageClassifier();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteClassifier(classifierId).execute();
  }

  @CronapiMetaData
  public static Classifier getClassifier(String username, String password, String endPoint, Map<String, String> headers,
                                         String classifierId) {
    NaturalLanguageClassifier service = new NaturalLanguageClassifier();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getClassifier(classifierId).execute();
  }

  @CronapiMetaData
  public static Classifiers getClassifiers(String username, String password, String endPoint, Map<String, String> headers) {
    NaturalLanguageClassifier service = new NaturalLanguageClassifier();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getClassifiers().execute();
  }
}
