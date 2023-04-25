package org.example;

public class LowerPaneCommand implements Command {

        private final Pane pane;

        public LowerPaneCommand(Pane pane) {
            this.pane = pane;
        }

        @Override
        public void execute() {
            pane.lower();
        }
}
