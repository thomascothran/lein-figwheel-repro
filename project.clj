(defproject testing-clj-17 "1.1.0-SNAPSHOT"
  :description "Testing CLJ 1.7"
  :dependencies [#_[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojure "1.8.0"]
                 [clj-time "0.14.2"]
                 [figwheel-sidecar "0.5.0-SNAPSHOT" :scope "test"]
                 #_[org.clojure/clojurescript "1.7.170"]
                 [org.clojure/clojurescript "1.10.238"]]
  :main clj-test.core  ;; This runs just fine, no matter what the Clojure version
  :plugins [[lein-figwheel "0.5.16"]]
  :clean-targets [:target-path "out"]
  :cljsbuild {
              :builds [{:id "dev"
                        :source-paths ["src/cljs_test"]
                        :figwheel true
                        :compiler {:main "cljs-test.hello"}
                        }]})
