(ns p002.core
  (:gen-class))

(defn fib
  ([] (fib 1 2))
  ([a b] (lazy-seq (cons a (fib b (+ a b))))))

(defn -main
  [& args]
  (println (reduce + (filter even? (take-while (partial > 4000000) (fib)))))
)
