package org.carrot2.workbench.core.ui;

import org.eclipse.ui.IWorkbenchPart;

/**
 * A cluster tree view displays a {@link ClusterTree} control attached
 * to the currently visible editor.
 */
public final class ClusterTreeView extends PageBookViewBase
{
    /**
     * Public identifier of this view.
     */
    public static final String ID = "org.carrot2.workbench.core.views.clusters";

    /**
     * Create a tree view for the given part.
     */
    @Override
    protected PageRec doCreatePage(IWorkbenchPart part)
    {
        final SearchEditor editor = (SearchEditor) part;

        final ClusterTreeViewPage page = new ClusterTreeViewPage(editor);
        initPage(page);
        page.createControl(getPageBook());

        return new PageRec(part, page);
    }

    /**
     * Only react to {@link SearchEditor} instances.
     */
    @Override
    protected boolean isImportant(IWorkbenchPart part)
    {
        return part instanceof SearchEditor;
    }
}
