package com.javafx.experiments.scenicview;

import java.util.List;

import javafx.scene.Scene;
import javafx.scene.control.TreeItem;

import com.javafx.experiments.scenicview.connector.SVNode;
import com.javafx.experiments.scenicview.connector.event.AppEvent;

interface Model2GUI {

    void updateStageModel(StageModel stageModel);

    void selectOnClick(StageModel stageModel, TreeItem<SVNode> findDeepSelection);

    boolean isIgnoreMouseTransparent();

    boolean isAutoRefreshStyles();

    List<TreeItem<SVNode>> getTreeItems();

    void updateSceneDetails(StageModel stageModel, Scene targetScene);

    void dispatchEvent(AppEvent appEvent);

}
