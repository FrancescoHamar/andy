package nl.tudelft.cse1110.grader.execution.step;

import nl.tudelft.cse1110.grader.codechecker.engine.CheckScript;
import nl.tudelft.cse1110.grader.config.Configuration;
import nl.tudelft.cse1110.grader.execution.ExecutionStep;
import nl.tudelft.cse1110.grader.result.ResultBuilder;

import static nl.tudelft.cse1110.grader.util.FileUtils.findSolution;

public class CodeChecksStep implements ExecutionStep {
    @Override
    public void execute(Configuration cfg, ResultBuilder result) {

        CheckScript script = cfg.getCodeCheckerScript();
        script.runChecks(findSolution(cfg.getWorkingDir()));

        result.logCodeChecks(script);

    }
}