(ns p001.core
  (:gen-class))

(defn -main
  [& args]
  (println (reduce + (set (concat (range 0 1000 3) (range 0 1000 5)))))
)
