(defproject atlantique/clj-twilio "0.2.1-SNAPSHOT"
  :description "Clojure Twilio API"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [prxml "1.3.0"]]
  :jar-name "clj-twilio.jar"
  :aot [twilio.core
        twilio.twiml.core
        twilio.twiml.sms
        twilio.twiml.voice])