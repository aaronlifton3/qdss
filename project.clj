(defproject riaktor "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.5.1"]
    [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
    [http-kit "2.1.13"]
    [hiccup "1.0.4"]
    [com.novemberain/welle "2.0.0-beta1"]
    ]
  :main ^:skip-aot riaktor.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
