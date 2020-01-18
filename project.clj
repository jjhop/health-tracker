(defproject health-tracker "0.0.1-SNAPSHOT"
  :description "Not yet..."
  :url "https://github.com/jjhop/health-tracker"
  :license {:name "GNU General Public License v3.0"
            :url "https://github.com/jjhop/health-tracker/blob/master/LICENSE"}
  :dependencies [
                 [org.clojure/clojure "1.10.1"]
                 [org.hsqldb/hsqldb "2.5.0"]]
  :aot :all
  :jvm-opts ["-Dclojure.compiler.direct-linking=true"]
  :main ht.boot.Main)
