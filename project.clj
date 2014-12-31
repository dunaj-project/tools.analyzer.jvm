(defproject org.dunaj/tools.analyzer.jvm "0.6.6-dunaj-SNAPSHOT"
  :description "Additional jvm-specific passes for tools.analyzer."
  :url "https://github.com/clojure/tools.analyzer.jvm"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :dependencies [#_[org.clojure/clojure "1.7.0-alpha4"]
                 [org.clojure/core.memoize "0.5.6"]
                 [org.clojure/tools.reader "0.8.13"]
                 [org.dunaj/tools.analyzer "0.6.5-dunaj-SNAPSHOT"]
                 [org.ow2.asm/asm-all "4.2"]])
