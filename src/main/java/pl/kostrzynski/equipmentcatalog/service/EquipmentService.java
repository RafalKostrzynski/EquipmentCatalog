package pl.kostrzynski.equipmentcatalog.service;


import pl.kostrzynski.equipmentcatalog.model.Classification;
import pl.kostrzynski.equipmentcatalog.model.Equipment;

import java.util.List;

public interface EquipmentService {

    List<Equipment> getAllEquipment();
    List<Equipment> getAllAvailableEquipment();
    List<Equipment> getAllAvailableEquipmentByClassification(Classification classification);
    List<Equipment> getAllAvailableEquipmentBySpecification(String specification);
    List<Equipment> getAvailableEquipmentByName(String Name);
    Equipment getEquipmentById(long id);
    boolean addEquipment(Equipment equipment);
    boolean changeAvailability(Long id,boolean availability);

}