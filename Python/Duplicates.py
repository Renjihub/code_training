# Print duplicate characters from string 
# Take sample string and print all duplicate characters.
	

sample_str = "Helloo"
print("Sample String :",sample_str)
duplicate = set()
for char in sample_str:
  count = 0
  for char_s in sample_str:
    if char.lower()==char_s.lower():
      count = count+1
  if count>1:
    duplicate.add(char)
if duplicate:
	print("Duplicate elements are : ",duplicate)
else:
  print("No repeating character found.")
