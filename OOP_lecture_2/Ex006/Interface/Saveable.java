package OOP_lecture_2.Ex006.Interface;

import OOP_lecture_2.Ex006.Document.TextDocument;


public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
