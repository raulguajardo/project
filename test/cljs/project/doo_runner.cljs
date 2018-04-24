(ns project.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [project.core-test]))

(doo-tests 'project.core-test)
