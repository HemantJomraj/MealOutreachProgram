/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.EBTCard;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shruti
 */
public class EBTCardDirectory {
    private List<EBTCard> EBTCards = new ArrayList<>();

    public List<EBTCard> getEBTCards() {
        return EBTCards;
    }

    public void setEBTCards(List<EBTCard> EBTCards) {
        this.EBTCards = EBTCards;
    }
}
