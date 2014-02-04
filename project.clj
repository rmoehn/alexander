(defproject alexander "0.1.0-SNAPSHOT"
  :description "Connect to a CardDAV server and update event files for Katrin"
  :url "http://example.com/FIXME"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot alexander.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
