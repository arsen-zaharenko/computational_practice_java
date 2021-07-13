package run;

import compare.ValueComparator;
import entity.Gem;
import read.InfoReader;
import valid.XMLValidator;

import java.io.IOException;
import java.util.List;

/*
    2.  Алмазный фонд.
        Драгоценные и полудрагоценные камни, содержащиеся в павильоне, имеют следующие характеристики:
        — Name — название камня;
        — Preciousness — может быть драгоценным либо полудрагоценным;
        — Origin — место добывания;
        — Visual parameters (должно быть несколько) — могут быть: цвет (зеленый, красный, желтый и т.д.), прозрачность (измеряется в процентах 0–100%), способы огранки (количество граней 4–15);
        — Value — вес камня (измеряется в каратах).
        Корневой элемент назвать Gem.
        С помощью XSL преобразовать XML-файл в формат XML, где корневым элементом будет место происхождения.
 */

public class Main {
    public static void main(String[] args) {
        XMLValidator validator = new XMLValidator("data//gems.xml", "data//gems.xsd");
        try {
            if (validator.validate()) {
                InfoReader reader = new InfoReader();
                List<Gem> gems = reader.read("data//gems.xml");
                gems.sort(new ValueComparator());
                for (Gem gem : gems) {
                    System.out.println(gem + "\n");
                }
            } else {
                System.out.println(validator.getError());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
